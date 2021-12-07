package SymbolTable;

import java.util.ArrayList;

public class Scope {
    private String name;
    private Scope parent;
    private ArrayList<Scope> Childrenes =new ArrayList<Scope>();
    private ArrayList<Symbol> Variables = new ArrayList<Symbol>();
    int counter =1;
    public ArrayList<Scope> getChildrenes() {
        return Childrenes;
    }

    public void setChildrenes(ArrayList<Scope> childrenes) {
        Childrenes = childrenes;
    }
    public void addChildren(Scope child) {
        this.Childrenes.add(child);
    }

    public ArrayList<Symbol> getVariables() {
        return Variables;
    }

    public void setVariables(ArrayList<Symbol> variables) {
        Variables = variables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }


    public void addSymbol(Symbol symbol) {
        for(int i = 0; i<this.Variables.size(); i++)
        {

            if(this.Variables.get(i).getName().compareToIgnoreCase(symbol.getName())==0)
                this.counter++;
        }
        if(this.counter <=1)
        this.Variables.add(symbol);

    }
    public void printScope(ArrayList<Scope> children)
    {
        if (children==null)
            return;

        for(int i=0;i<children.size();i++)
        {
            System.out.println("\t" + children.get(i).getName());
            System.out.println("\t" + "{");
            if(children.get(i).getVariables().size()>0) {

                for (int j = 0; j < children.get(i).getVariables().size(); j++) {
                    System.out.println("\t" + children.get(i).getVariables().get(j).getName());
                }
            }
                if(children.get(i).getChildrenes()!=null)
                    printScope(children.get(i).getChildrenes());
                System.out.println("\t" + "}");



        }

    }

}
