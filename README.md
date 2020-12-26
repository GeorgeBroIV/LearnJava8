# Learn Java 8

## Overview
This repo contains classroom code by George Brotherston using [IntelliJ IDEA][1], based on Youtube ["Learn Java 8"][2] by Marcus Biel at [freeCodeCamp.org][3].

[1]: https://www.jetbrains.com/idea/
[2]: https://www.youtube.com/watch?v=grEKMHGYyns&t=1377s
[3]: www.freecodecamp.org

This ReadMe.md file contains ~~strikethrough~~ elements, which are placeholder templates for future updates to this file.

## ~~Guidelines~~
~~Run the example of connecting to OpenFin and creating applications~~

1. ~~Clone this repository~~

2. ~~Go to release directory and start run.bat~~

3. ~~Once the java app starts, click on Start button, which should start OpenFin Runtime.  The java app will wait and try to connect to OpenFin Runtime.~~

4. ~~Once OpenFin Runtime is started and Java app connects successfully,  "Create Application" button is enabled.  You can click on the button to bring up a dialog for entering configuration of any HTML5 app.  By default, the dialog is pre-populated with configuration for Hello OpenFin demo app.~~

5. ~~You can use buttons in Window Control section to move and re-size HTML5 window of Hello OpenFin app.~~

6. ~~Click "Create Application" button, which should start a dialog with all the fields pre-populated for our Hello OpenFin demo HTML5 application.  Just click on "Create" button.~~

7. ~~After Hello OpenFin starts, you can use the buttons under Window Control of Java app to control Hello OpenFin window.~~

## ~~Source Code Review~~

~~Source code for the example is located in /src/main/java/com/openfin/desktop/demo/OpenFinDesktopDemo.java.  The followings overview of how it communicates with OpenFin Runtime with API calls supported by the Java adapter:~~

1. ~~Create connection object:~~

```java
	sample code;
```
~~This code just creates an instance of DesktopConnection and it does not try to connect to runtime.~~

2. ~~Launch and connect to stable version of OpenFin runtime:~~

```java
	sample code;
```
~~listener is an instance of DesktopStateListener which provides callback on status of connections to runtime.~~

3. ~~Create new application when clicking on Create App:~~

```java
	sample code;
```
~~options is an instance of ApplicationOptions, which is populated from App Create dialog.  AckListener interface provides callback for the operation.~~

~~Once the application is created successfully, you can take actions on its window:~~

4.  ~~Change opacity:~~

```java
	sample code
```

5. ~~Change Window size~~

```java
	sample code
```

6. ~~Publishes messages to a topic with InterApplicationBus~~

```java
	sample code
```

7. ~~Subscribes to a topic with InterApplicationBus~~

```java
	sample code
```

## ~~Run the example of embedding HTML5 application into a Java Swing window~~

1. ~~Clone this repository~~

2. ~~Go to release directory and start embed.bat ( the default embedded url is https://openfin.co. Pass the url you wish to load if you want something different e.g. embed.bat https://www.mydomain.com )~~

3. ~~Once the java app starts, click on "Launch OpenFin" button, which should start OpenFin Runtime and embed the OpenFin application that points to https://openfin.co (or your custom url if you specified one)~~

4. ~~Click "Shutdown OpenFin" button to close HTML5 application and the Java Swing window~~

~~If there is a problem rendering the url please check your windows display settings to see ensure scaling is set to 100%.~~

## ~~Source Code Review for embedded OpenFin application~~

~~Source code for the example is located in /src/main/java/com/openfin/desktop/demo/WindowEmbedDemo.java~~

1. ~~create a canvas and place it where the HTML5 application should be embedded.~~

```java
	sample code
```

2. ~~listen to the canvas resize event, and resize embedded HTML5 application accordingly.~~

```java
	sample code
```

3. ~~launch and connect to OpenFin runtime~~

```java
	sample code
```

4. ~~create HTML5 application~~

```java
	sample code
```

5. ~~embed HTML5 application into the canvas~~

```java
	sample code
```

## ~~More Info~~
~~More information and API documentation can be found at https://openfin.co/java-api/~~

## Disclaimers
* This is classroom code and not meant for distribution.
* Its possible that the repo is not actively maintained.

## License
[GNU General Public License Version 3, 29 June 2007][4]

[4]: https://www.gnu.org/licenses/gpl-3.0.en.html

The code in this repository is covered by the included license.

## Support
Please enter an issue in the repo for any questions or problems.
<br> Alternatively, please contact us at support@stoneplayground.com