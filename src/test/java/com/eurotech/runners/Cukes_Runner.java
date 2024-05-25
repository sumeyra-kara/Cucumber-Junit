package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) // Junit'ten gelir,bu sayede runner class'larimiz cucumber ile calisir
@CucumberOptions( // bunun ile istedigimiz özellikleri Runner class'ina ekleyebiliriz
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun = false,
        tags = ""  // not, or, and


)

public class Cukes_Runner {
}
