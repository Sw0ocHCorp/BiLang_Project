/**
 */
package ucal3ia.bilang.abstractsyntax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Range Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getRangeOperator()
 * @model
 * @generated
 */
public enum RangeOperator implements Enumerator {
	/**
	 * The '<em><b>LR INCLUSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LR_INCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	LR_INCLUSION(0, "LR_INCLUSION", "[]"),

	/**
	 * The '<em><b>LR EXCLUSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LR_EXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	LR_EXCLUSION(1, "LR_EXCLUSION", "]["),

	/**
	 * The '<em><b>LINCLUSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	LINCLUSION(2, "L_INCLUSION", "[["),

	/**
	 * The '<em><b>RINCLUSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RINCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	RINCLUSION(4, "R_INCLUSION", "]]");

	/**
	 * The '<em><b>LR INCLUSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LR_INCLUSION
	 * @model literal="[]"
	 * @generated
	 * @ordered
	 */
	public static final int LR_INCLUSION_VALUE = 0;

	/**
	 * The '<em><b>LR EXCLUSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LR_EXCLUSION
	 * @model literal="]["
	 * @generated
	 * @ordered
	 */
	public static final int LR_EXCLUSION_VALUE = 1;

	/**
	 * The '<em><b>LINCLUSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINCLUSION
	 * @model name="L_INCLUSION" literal="[["
	 * @generated
	 * @ordered
	 */
	public static final int LINCLUSION_VALUE = 2;

	/**
	 * The '<em><b>RINCLUSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RINCLUSION
	 * @model name="R_INCLUSION" literal="]]"
	 * @generated
	 * @ordered
	 */
	public static final int RINCLUSION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Range Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RangeOperator[] VALUES_ARRAY = new RangeOperator[] { LR_INCLUSION, LR_EXCLUSION, LINCLUSION,
			RINCLUSION, };

	/**
	 * A public read-only list of all the '<em><b>Range Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RangeOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Range Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeOperator get(int value) {
		switch (value) {
		case LR_INCLUSION_VALUE:
			return LR_INCLUSION;
		case LR_EXCLUSION_VALUE:
			return LR_EXCLUSION;
		case LINCLUSION_VALUE:
			return LINCLUSION;
		case RINCLUSION_VALUE:
			return RINCLUSION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RangeOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //RangeOperator
