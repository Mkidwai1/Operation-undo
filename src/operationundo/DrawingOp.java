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
public class DrawingOp {
    private String name;


    public DrawingOp(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Operation{" + "name=" + name + '}';
    }

    

    
    
}
