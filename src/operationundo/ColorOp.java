/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationundo;

/**
 *
 * @author clatulip
 */
public class ColorOp extends DrawingOp {
    private String colName;
    
    public ColorOp(String name, String colName) {
        super(name);
        this.colName = colName;
    }

    @Override
    public String toString() {
        return super.toString() + " StateOp{" + "colName=" + colName + '}';
    }
    
}
