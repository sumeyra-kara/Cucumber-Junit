package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-reports.html"},
        features = "@target/rerun.txt", // hatali testlerin kosmasi icin
        glue = "com/eurotech/step_definitions"
)

public class FailedTestRunner { // eski versiyonlarda bu class olusturuluyordu,simdi zorunlu degil
    // bazen eski versiyonlar kullanilabilir, o zaman bu class olusturulmak zorunda
    // yeni versiyonlar icin olusturulmak zorunda degil.


}

/*
maven, bir gelistirme sistemidir
kendi icinde bir yapisi vardir. bize dependences'leri yani kutuphaneleri almamizi saglar.
Ayrica kendi life cycle ile projemizi kurabiliriz.maven ile tüm ayarlari yapariz.
maven'in olmazsa olmaz'i,beyni POM file'dir. butun proje burada kurulur ve yurutulur.


 */
