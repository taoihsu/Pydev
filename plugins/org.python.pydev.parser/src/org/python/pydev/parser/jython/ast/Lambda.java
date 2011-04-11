// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class Lambda extends exprType {
    public argumentsType args;
    public exprType body;

    public Lambda(argumentsType args, exprType body) {
        this.args = args;
        this.body = body;
    }


    public Lambda createCopy() {
        Lambda temp = new Lambda(args!=null?(argumentsType)args.createCopy():null,
        body!=null?(exprType)body.createCopy():null);
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
        StringBuffer sb = new StringBuffer("Lambda[");
        sb.append("args=");
        sb.append(dumpThis(this.args));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitLambda(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null){
            args.accept(visitor);
        }
        if (body != null){
            body.accept(visitor);
        }
    }

}
