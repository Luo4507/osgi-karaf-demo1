package com.michaelrice.demo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class DemoActivator implements BundleActivator {

    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("STARTING DEMO: hello, world");
        System.out.println("首次进来，开始干活拉.......");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("....收工下班啦");
        System.out.println("……Demo stop!");
    }

}
