# automation-appium

# Description
This exercise implements Selenium and Appium to run a page object model test framework base on TesnNg for showing the benefits of parallel execution. This project is intended to run locally using Android Studio (for emulators images) and an Appium server (as nodes for that images). the principal objective with this is to perform a set of tests on several versions of Android images.

# Pre-requisites
For run this exercise we require the following steps:

1. Java SDK - [Link](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html)
2. ANDROID SDK - [Link](http://developer.android.com/sdk/index.html)
3. IDE (I'm using Intellij) - [Link](https://www.guru99.com/install-java.html)
4. Appium Desktop - [Link](https://www.jetbrains.com/es-es/idea/download/)
5. Configure the required variables in your OS, I'm using Windows 10 x64 for this I create/change the following system variables (Adjust the routes according to your environment):

| Variable Name | Value |
| ------ | ------ |
| ANDROID_HOME | C:\Users\USER\AppData\Local\Android\Sdk |
| ANDROID_SDK | C:\Users\USER\AppData\Local\Android\Sdk |
| ANDROID_SDK_ROOT | C:\Users\USER\AppData\Local\Android\Sdk |
| JAVA_HOME | C:\Program Files\Java\jdk1.8.0_251 |

Also, it's necessary to add the following routes to your Path variable:

| Path | 
| ------ | 
| C:\Users\USER\AppData\Local\Android\Sdk |
| C:\Users\USER\AppData\Local\Android\Sdk\emulator |
| C:\Users\USER\AppData\Local\Android\Sdk\build-tools | 
| C:\Users\USER\AppData\Local\Android\Sdk\platform-tools | 
| C:\Users\USER\AppData\Local\Android\Sdk\tools| 
| C:\Users\USER\AppData\Local\Android\Sdk\tools\bin | 
| %JAVA_HOME%\bin | 
| C:\Users\USER\AppData\Roaming\npm\node_modules\appium\node_modules\.bin| 


6. Create the necessary images for the project 
In order to execute the test is necessary to have configured images on Android Studio, for that you could use the following guide to help you in the AVD manager configuration: 
For run directly the project without modification you need to set up the following AVD images with the following names: 

* API27_Oreo_8.1_Pixel2
* API28_Pie_9_Pixel2
* API29_Q_10_Pixel2

# Steps to run the project
* On Intellij
1. Open IntelliJ and select the option "Get from Version Control"
![alt text](https://i.ibb.co/MsP4n2V/image.png) 
2. Enter the URL of the project and select the location and click on Clone
![alt text](https://i.ibb.co/VLTK1q4/image.png) 
3. Wait until it loads the project, after that select Build -> Build Project
![alt text](https://i.ibb.co/zrR4BPg/image.png) 
4. This should report that the Build was completed successfully
5. Navigate in the project to \src\test\java\utilities until you found the class ServerManager, open a left click and select "Run 'ServerManager.main()'"
![alt text](https://i.ibb.co/fDyqNJs/image.png) 
6. This should start several consoles that start the hub, the Appium nodes, and the images emulators.
![alt text](https://i.ibb.co/TBZ2jr8/image.png) 
8. In the root of the project you can find the file "testng_grid.xml", this controls the execution of the different tests, over that file do a left-click and select "Run '{YOUR_REPOSITORY_URL}/testng_grid.xml"
![alt text](https://i.ibb.co/2PhS2Xs/image.png) 
9. You can check the results of the execution, this should pass over the images with Android Pie and Oreo and fail for compatibility issues with Q image

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update the tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
