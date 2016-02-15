package fi.fxstudio.tests;

import org.junit.Ignore;
import org.junit.Test;

import fi.fxstudio.math.Vector2;
import static fi.fxstudio.math.Constants.*;

import fi.fxstudio.instrumentation.stopwatch.StopWatch;


/**
 * Created by anttir on 2/15/16.
 */
public class ClockingVector2D {
    @Test
    public void operations(){

        StopWatch sw = new StopWatch("Vector2");

        Vector2 v1 = Vector2.ofXY(2.0, 3.0);
        Vector2 v2 = Vector2.ofXY(4.0, 6.0);

        int repeatCount=2000000;

        sw.startInterval("addition ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.add(v2);
        }

        sw.startInterval("subtract ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.subtract(v2);
        }

        sw.startInterval("complexPower ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.complexPower(v2);
        }

        sw.startInterval("multiply by Vector2 ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.multiply(v2);
        }

        sw.startInterval("multiply by scalar ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.multiply(4.2);
        }

        sw.startInterval("divide by Vector2 ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.divide(v2);
        }

        sw.startInterval("divide by scalar ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.divide(4.2);
        }

        sw.startInterval("complexConjugate ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.complexConjugate();
        }

        sw.startInterval("negate ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.negate();
        }

        sw.startInterval("normalize ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.normalize();
        }

        sw.startInterval("rotate ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 vResult = v1.rotate(2.4);
        }

        sw.startInterval("dotProduct ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Double result = v1.dotProduct(v2);
        }

        sw.startInterval("Vector2.ofRA(3.0, 1.0) ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 v = Vector2.ofRA(3.0, 1.0);
        }

        sw.startInterval("Vector2.ofXY(1.0, 5.0); ( " + repeatCount +  " )");
        for(int i=0; i<repeatCount; i++){
            Vector2 v = Vector2.ofXY(1.0, 5.0);
        }


        sw.stopInterval();

        System.out.println(sw.getResultAsString());
    }
}
