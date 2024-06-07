package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) // Junit'ten gelir,bu sayede runner class'larimiz cucumber ile calisir
@CucumberOptions( // bunun ile istedigimiz özellikleri Runner class'ina ekleyebiliriz
        plugin = {"json:target/cucumber.json",
                "html:target/html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun = false,
        tags = "@edit",  // not, or, and
        publish=false // fur TestErgebnisse, cucumber reports

)

public class Cukes_Runner {
        /*
        Cucumber Options'un oncelikli gorevi features dosyalari ile stepdefinitions'da bulunan Java method'larini
        ilisiklendirmektir
         */
        // mvn verify -Dcucumber.filter.tags="@regression" ---cmd den bu ile yapilabiliyor
        // -DBROWSER=firefox --cmd
        // mvn verify -DBROWSER=firefox -Dcucumber.filter.tags="@login"
}
