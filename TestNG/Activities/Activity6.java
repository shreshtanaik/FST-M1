<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite parallel="false" name="Suite">
    <test name="Test">
        <parameter name="username" value="admin"/>
        <parameter name="password" value="password"/>
        <classes>
            <class name="session9.Activity6"/>
        </classes>
    </test> <!-- Test -->
</suite> <!-- Suite -->