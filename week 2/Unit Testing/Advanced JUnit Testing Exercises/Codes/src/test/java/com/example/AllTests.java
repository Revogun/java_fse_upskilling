package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ EvenCheckerTest.class, ExceptionThrowerTest.class, PerformanceTesterTest.class })
public class AllTests {}
