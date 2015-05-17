/**
 */
package Model.impl;

import Model.Exemplar;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ExemplarImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getAno <em>Ano</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#isStatusReserva <em>Status Reserva</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#isStatusBloqueio <em>Status Bloqueio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAno() <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAno()
	 * @generated
	 * @ordered
	 */
	protected static final int ANO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAno() <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAno()
	 * @generated
	 * @ordered
	 */
	protected int ano = ANO_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatusReserva() <em>Status Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusReserva()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_RESERVA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatusReserva() <em>Status Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusReserva()
	 * @generated
	 * @ordered
	 */
	protected boolean statusReserva = STATUS_RESERVA_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatusBloqueio() <em>Status Bloqueio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusBloqueio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_BLOQUEIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatusBloqueio() <em>Status Bloqueio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusBloqueio()
	 * @generated
	 * @ordered
	 */
	protected boolean statusBloqueio = STATUS_BLOQUEIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXEMPLAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAno(int newAno) {
		int oldAno = ano;
		ano = newAno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__ANO, oldAno, ano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatusReserva() {
		return statusReserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReserva(boolean newStatusReserva) {
		boolean oldStatusReserva = statusReserva;
		statusReserva = newStatusReserva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__STATUS_RESERVA, oldStatusReserva, statusReserva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatusBloqueio() {
		return statusBloqueio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusBloqueio(boolean newStatusBloqueio) {
		boolean oldStatusBloqueio = statusBloqueio;
		statusBloqueio = newStatusBloqueio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__STATUS_BLOQUEIO, oldStatusBloqueio, statusBloqueio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reservaExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bloqueiaExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void retornaConsulta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void desbloqueiaExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void emprestaExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void devolveExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__NOME:
				return getNome();
			case ModelPackage.EXEMPLAR__CODIGO:
				return getCodigo();
			case ModelPackage.EXEMPLAR__AUTOR:
				return getAutor();
			case ModelPackage.EXEMPLAR__ANO:
				return getAno();
			case ModelPackage.EXEMPLAR__STATUS_RESERVA:
				return isStatusReserva();
			case ModelPackage.EXEMPLAR__STATUS_BLOQUEIO:
				return isStatusBloqueio();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.EXEMPLAR__CODIGO:
				setCodigo((String)newValue);
				return;
			case ModelPackage.EXEMPLAR__AUTOR:
				setAutor((String)newValue);
				return;
			case ModelPackage.EXEMPLAR__ANO:
				setAno((Integer)newValue);
				return;
			case ModelPackage.EXEMPLAR__STATUS_RESERVA:
				setStatusReserva((Boolean)newValue);
				return;
			case ModelPackage.EXEMPLAR__STATUS_BLOQUEIO:
				setStatusBloqueio((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__ANO:
				setAno(ANO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__STATUS_RESERVA:
				setStatusReserva(STATUS_RESERVA_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__STATUS_BLOQUEIO:
				setStatusBloqueio(STATUS_BLOQUEIO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.EXEMPLAR__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ModelPackage.EXEMPLAR__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case ModelPackage.EXEMPLAR__ANO:
				return ano != ANO_EDEFAULT;
			case ModelPackage.EXEMPLAR__STATUS_RESERVA:
				return statusReserva != STATUS_RESERVA_EDEFAULT;
			case ModelPackage.EXEMPLAR__STATUS_BLOQUEIO:
				return statusBloqueio != STATUS_BLOQUEIO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EXEMPLAR___RESERVA_EXEMPLAR:
				reservaExemplar();
				return null;
			case ModelPackage.EXEMPLAR___BLOQUEIA_EXEMPLAR:
				bloqueiaExemplar();
				return null;
			case ModelPackage.EXEMPLAR___RETORNA_CONSULTA:
				retornaConsulta();
				return null;
			case ModelPackage.EXEMPLAR___DESBLOQUEIA_EXEMPLAR:
				desbloqueiaExemplar();
				return null;
			case ModelPackage.EXEMPLAR___EMPRESTA_EXEMPLAR:
				emprestaExemplar();
				return null;
			case ModelPackage.EXEMPLAR___DEVOLVE_EXEMPLAR:
				devolveExemplar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nome: ");
		result.append(nome);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", autor: ");
		result.append(autor);
		result.append(", ano: ");
		result.append(ano);
		result.append(", statusReserva: ");
		result.append(statusReserva);
		result.append(", statusBloqueio: ");
		result.append(statusBloqueio);
		result.append(')');
		return result.toString();
	}

} //ExemplarImpl
