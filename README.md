# AMAZON TEST AUTOMATION

## HOW RUN IT

first you need finding the file here `src/test/java/com/automation/amazon/Suite.xml`

once there you might choose the web browser to run the test

`chrome` or `firefox`

```xml
<parameter name="browser" value="" />
```

there you might find another parameters

```xml
<parameter name="product" value="" />
<parameter name="productTitle" value="" />
```

- IS NECESSARY SET EVERY VALUE TO THESE PARAMETERS.

* You should add the web drivers in the following path `src/test/`
  and modify the property `System.setProperty()` into `MyDriver.java`

`MyDriver.java` could found in `src/main/java/com/automation/amazon/`
