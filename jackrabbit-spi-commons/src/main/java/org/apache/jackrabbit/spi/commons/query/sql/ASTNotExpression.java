/* Generated By:JJTree: Do not edit this line. ASTNotExpression.java */

package org.apache.jackrabbit.spi.commons.query.sql;

public class ASTNotExpression extends SimpleNode {
  public ASTNotExpression(int id) {
    super(id);
  }

  public ASTNotExpression(JCRSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JCRSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}