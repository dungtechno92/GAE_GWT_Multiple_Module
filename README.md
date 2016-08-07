# GAE_GWT_Multiple_Module

Step1: Create 2 or more than 2 file .gwt.xml  (Module2.gwt.xml, Module2.gwt.xml)

Step 2: Compile Java -> Js : (We will get 2 files .nocache.js in war folder)

```sh
    ant gwt-compile
```

Step3: Export the modules to .jar file

```sh
    ant jar
```
Step 4: Import above .jar file to other projects, and keep in mind to import the module you want to use.

```xml

<inherits name='com.lmt.hello.Module1' />
<inherits name='com.lmt.hello.Module2' />

```
