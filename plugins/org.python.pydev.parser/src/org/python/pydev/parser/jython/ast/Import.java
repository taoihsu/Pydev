// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class Import extends stmtType {
    public aliasType[] names;

    public Import(aliasType[] names) {
        this.names = names;
    }


    public Import createCopy() {
        aliasType[] new0;
        if(this.names != null){
        new0 = new aliasType[this.names.length];
        for(int i=0;i<this.names.length;i++){
            new0[i] = (aliasType) (this.names[i] != null? this.names[i].createCopy():null);
        }
        }else{
            new0 = this.names;
        }
        Import temp = new Import(new0);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy());
                }
            }
        }
        if(this.specialsAfter != null){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy());
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Import[");
        sb.append("names=");
        sb.append(dumpThis(this.names));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitImport(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (names != null) {
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null){
                    names[i].accept(visitor);
                }
            }
        }
    }

}
