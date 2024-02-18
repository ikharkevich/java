# Java Installation & Setup Guide

This guide provides the necessary steps for installing Java Development Kit (JDK) on your system.

## Prerequisites

* Check if Java is already installed by opening a command terminal and typing `java -version`. If Java is installed, the version number will be displayed.

## Installation steps

### Windows

1. Go to Oracle's JDK downloads page: `https://www.oracle.com/java/technologies/javase-jdk11-downloads.html`
2. Click the download link next to "Windows x64 Installer".
3. Follow the onscreen instructions to accept Oracle's license agreement and download the installer.
4. Run the installer and follow the onscreen instructions to install Java.

### MacOS

1. Go to Oracle's JDK downloads page: `https://www.oracle.com/java/technologies/javase-jdk11-downloads.html`
2. Click the download link next to "macOS Installer".
3. Follow the onscreen instructions to accept Oracle's license agreement and download the installer.
4. Run the installer and follow the onscreen instructions to install Java.

### Linux (Debian/Ubuntu)

1. Open a terminal window.
2. Update the package index:
```
sudo apt update
```
3. Install the OpenJDK 11 JDK package:
```
sudo apt install openjdk-11-jdk
```

### Linux (Fedora/RHEL/CentOS)

1. Open a terminal window.
2. Install the JDK package:
```
sudo dnf install java-11-openjdk-devel
```

## Verifying the Installation

Verify that Java is installed correctly by opening a command terminal and typing `java -version`.

## Setting the JAVA_HOME Environment Variable

JAVA_HOME is an environment variable which many Java-based applications use to find the JDK installation directory.

**Windows:**

1. Right-click the Computer icon on your desktop and select Properties.
2. Click "Advanced system settings".
3. Click "Environment Variables".
4. Under "System variables", click "New".
5. Enter `JAVA_HOME` for the variable name.
6. Enter the path to your Java installation for the variable value (e.g., `C:\Program Files\Java\jdk-11.0.<update>`).
7. Click OK to apply the changes.

**Linux/MacOS:**

Add these lines to your `.bashrc` or `.bash_profile` file:

```bash
export JAVA_HOME=/path/to/your/java/installation
export PATH=$PATH:$JAVA_HOME/bin
```

Remember to replace `/path/to/your/java/installation` with your actual java path.

## Conclusion

You have successfully installed Java and set the `JAVA_HOME` variable on your system!
