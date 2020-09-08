import cv2
import numpy as np 

front_cassade = cv2.CascadeClassifier('frontface.xml')

eyes_cassade = cv2.CascadeClassifier('eyes.xml')

#front_cassade = cv2.CasscadeClassier(frontface.xml)

#eyes_cassade = cv2.CasscadeClassier(eyes.xml)

cap = cv2.VideoCapture(0)
arr1 = [490,217,349,349]
arr = [214,87,77,77]

while True:
    ret, img = cap.read()
    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    faces = front_cassade.detectMultiScale(gray, 1.3, 5)
    
    #print faces
    for (x ,y, w, h) in faces:
        if x == arr1[0] and y == arr1[1] and w == arr1[2] and h == arr1[3]:
            print "face matched"
        cv2.rectangle(img, (x,y), (x+w,y+h), (255,0,0), 2)
        roi_gray = gray[y:y+h,x:x+w]
        roi_color = img[y:y+h , x:x+w]
        eyes = eyes_cassade.detectMultiScale(roi_gray)
        #print eyes
        for (ex ,ey, ew, eh) in eyes:
            cv2.rectangle(roi_color , (ex,ey), (ex+ew,ey+eh), (0,255,0), 2)
            if ex == arr[0] and ey == arr[1] and ew == arr[2] and eh == arr[3]:
                print "eyes matched"

            

    cv2.imshow('img',img)
    k = cv2.waitKey(1)
    if k%256 == 32:
        print "eyes", eyes
        print "faces", faces
        break

cap.release()
cv2.destroyAllWindows()
