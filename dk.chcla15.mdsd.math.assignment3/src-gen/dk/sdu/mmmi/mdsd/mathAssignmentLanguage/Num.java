/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mmmi.mdsd.mathAssignmentLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.Num#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getNum()
 * @model
 * @generated
 */
public interface Num extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getNum_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.Num#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Num