/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package websiteschema.fb.common.merge;

import websiteschema.fb.annotation.Algorithm;
import websiteschema.fb.annotation.EI;
import websiteschema.fb.annotation.EO;
import websiteschema.fb.core.FunctionBlock;

/**
 *
 * @author mgd
 */
@EI(name = {"EI1:M", "EI2:M"})
@EO(name = {"EO"})
public class DualMerge extends FunctionBlock {

    @Algorithm(name = "M")
    public void merge2e() {
        triggerEvent("EO");
    }
}
