# firebasebug
Project just for showing my firebase problem

I recieve an error then I use all libs from my project: 

java.lang.IllegalStateException: Default FirebaseApp is not initialized in this process it.clipcall.another. Make sure to call FirebaseApp.initializeApp(Context) first.
                                                                       at com.google.firebase.FirebaseApp.getInstance(Unknown Source)
                                                                       at com.google.firebase.iid.FirebaseInstanceId.getInstance(Unknown Source)
                                                                       at it.clipcall.qa.MainActivity$2.onClick(MainActivity.java:75)
                                                                       
if I try use FirebaseApp.initializeApp(this); in Activity or Application class I recieve a token but it not registered                                                                       
                                                                       
