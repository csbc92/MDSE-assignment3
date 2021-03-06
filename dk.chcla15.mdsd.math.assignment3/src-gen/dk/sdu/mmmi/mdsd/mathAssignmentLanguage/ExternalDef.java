/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mmmi.mdsd.mathAssignmentLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.ExternalDef#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.ExternalDef#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getExternalDef()
 * @model
 * @generated
 */
public interface ExternalDef extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getExternalDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.ExternalDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.mathAssignmentLanguage.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.mathAssignmentLanguage.MathAssignmentLanguagePackage#getExternalDef_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // ExternalDef
