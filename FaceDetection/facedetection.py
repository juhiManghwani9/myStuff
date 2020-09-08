import cv2
import numpy as np 

front_cassade = cv2.CascadeClassifier('frontface.xml')

eyes_cassade = cv2.CascadeClassifier('eyes.xml')

#front_cassade = cv2.CasscadeClassier(frontface.xml)

#eyes_cassade = cv2.CasscadeClassier(eyes.xml)

cap = cv2.VideoCapture(0)

while True:
    ret, img = cap.read()
    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    faces = front_cassade.detectMultiScale(gray, 1.3, 5)
    #print faces
    for (x ,y, w, h) in faces:
        cv2.rectangle(img, (x,y), (x+w,y+h), (255,0,0), 2)
        roi_gray = gray[y:y+h,x:x+w]
        roi_color = img[y:y+h , x:x+w]
        eyes = eyes_cassade.detectMultiScale(roi_gray)
        #print eyes
        for (ex ,ey, ew, eh) in eyes:
            cv2.rectangle(roi_color , (ex,ey), (ex+ew,ey+eh), (0,255,0), 2)
            

    cv2.imshow('img',img)
    k = cv2.waitKey(1)
    if k%256 == 32:
        print "eyes", eyes
        print "faces", faces
        break

cap.release()
cv2.destroyAllWindows()
