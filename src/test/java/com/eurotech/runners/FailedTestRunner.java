package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-reports.html"},
        features = "@target/rerun.txt",
        glue = "com/eurotech/step_definitions"
)

public class FailedTestRunner { // eski versiyonlarda bu class olusturuluyordu,simdi zorunlu degil
    // bazen eski versiyonlar kullanilabilir, o zaman bu class olusturulmak zorunda
    // yeni versiynlar icin olusturulmak zorunda degil



}
