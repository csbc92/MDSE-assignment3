/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mmmi.mdsd.mathAssignmentLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.ResultStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.ResultStatement#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getResultStatement()
 * @model
 * @generated
 */
public interface ResultStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getResultStatement_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.ResultStatement#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getResultStatement_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.ResultStatement#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // ResultStatement