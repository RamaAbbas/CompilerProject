package SymbolTable;

import java.util.ArrayList;

public class SymbolTable {
    private ArrayList<Scope> scopes = new ArrayList<Scope>();

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public void addScope(Scope scope) {
        this.scopes.add(scope);
    }

    public void PrintSymtable() {
        for (int i = 0; i < scopes.size(); i++) {
            System.out.println(scopes.get(i).getName());
            System.out.println("{");
            for(int j = 0; j<scopes.get(i).getVariables().size(); j++)
                System.out.println(scopes.get(i).getVariables().get(j).getName());
            scopes.get(i).printScope(scopes.get(i).getChildrenes());
            System.out.println("}");
        }
    }
}