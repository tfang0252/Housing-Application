# Housing Application
#Student-Housing Portal Project
Java Swing Application for students to manage on-campus housing. 
Students will have a personalized profile where they can log in and
maintain their own information on their account and housing preference.Students 
can submit maintenance requests which are received by admins.Students can search for
nearby housing locations using Google Map API.Students can view FAQ & submit questions.


##API Not Loading##
If location and event page are not loading properly,it is likely external libraries were not added
properly. These 11 external jars located in the Student Housing GUI Folder are required for the API to 
function: BrowserLicense, MapLicense, jxmaps-1.3.1,jxmaps-mac-1.3.1,jxmapslinux32-1.3.1,jxmapslinux64-1.3.1,
jxmapss-win.1.3.1,jxbrowser-6.17,jxbrowser-linux64-6.17,jxbrowser-mac-6.17,jxbrowser-win32-6.17

To add Jars right click the Student Housing GUI Folder in Eclipse Package Explorer, and selected properties.
Next Click on Java Build Path and select the libraries tab. Choose Add External JARs.. add the 11 jars listed above
and hit apply. 

##Build Instructions##
Open Zipfile, Run Application.
