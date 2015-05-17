/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Usuario;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.UsuarioImpl#getPrimeiroNome <em>Primeiro Nome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getUltimoNome <em>Ultimo Nome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEndereco1 <em>Endereco1</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEndereco2 <em>Endereco2</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCidade <em>Cidade</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getPais <em>Pais</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCep <em>Cep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The default value of the '{@link #getPrimeiroNome() <em>Primeiro Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeiroNome()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMEIRO_NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimeiroNome() <em>Primeiro Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeiroNome()
	 * @generated
	 * @ordered
	 */
	protected String primeiroNome = PRIMEIRO_NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUltimoNome() <em>Ultimo Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimoNome()
	 * @generated
	 * @ordered
	 */
	protected static final String ULTIMO_NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUltimoNome() <em>Ultimo Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimoNome()
	 * @generated
	 * @ordered
	 */
	protected String ultimoNome = ULTIMO_NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected String dataNascimento = DATA_NASCIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected String telefone = TELEFONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco1() <em>Endereco1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco1()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco1() <em>Endereco1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco1()
	 * @generated
	 * @ordered
	 */
	protected String endereco1 = ENDERECO1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco2() <em>Endereco2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco2()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco2() <em>Endereco2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco2()
	 * @generated
	 * @ordered
	 */
	protected String endereco2 = ENDERECO2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected String cidade = CIDADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected static final String PAIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected String pais = PAIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected static final String CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected String cep = CEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimeiroNome(String newPrimeiroNome) {
		String oldPrimeiroNome = primeiroNome;
		primeiroNome = newPrimeiroNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PRIMEIRO_NOME, oldPrimeiroNome, primeiroNome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUltimoNome() {
		return ultimoNome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimoNome(String newUltimoNome) {
		String oldUltimoNome = ultimoNome;
		ultimoNome = newUltimoNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ULTIMO_NOME, oldUltimoNome, ultimoNome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataNascimento(String newDataNascimento) {
		String oldDataNascimento = dataNascimento;
		dataNascimento = newDataNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__DATA_NASCIMENTO, oldDataNascimento, dataNascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(String newCpf) {
		String oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefone(String newTelefone) {
		String oldTelefone = telefone;
		telefone = newTelefone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TELEFONE, oldTelefone, telefone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco1() {
		return endereco1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco1(String newEndereco1) {
		String oldEndereco1 = endereco1;
		endereco1 = newEndereco1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ENDERECO1, oldEndereco1, endereco1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco2() {
		return endereco2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco2(String newEndereco2) {
		String oldEndereco2 = endereco2;
		endereco2 = newEndereco2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ENDERECO2, oldEndereco2, endereco2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidade(String newCidade) {
		String oldCidade = cidade;
		cidade = newCidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CIDADE, oldCidade, cidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPais(String newPais) {
		String oldPais = pais;
		pais = newPais;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PAIS, oldPais, pais));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCep(String newCep) {
		String oldCep = cep;
		cep = newCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CEP, oldCep, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reserva() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void empresta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void devolve() {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				return getPrimeiroNome();
			case ModelPackage.USUARIO__ULTIMO_NOME:
				return getUltimoNome();
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				return getDataNascimento();
			case ModelPackage.USUARIO__EMAIL:
				return getEmail();
			case ModelPackage.USUARIO__CPF:
				return getCpf();
			case ModelPackage.USUARIO__TELEFONE:
				return getTelefone();
			case ModelPackage.USUARIO__ENDERECO1:
				return getEndereco1();
			case ModelPackage.USUARIO__ENDERECO2:
				return getEndereco2();
			case ModelPackage.USUARIO__CIDADE:
				return getCidade();
			case ModelPackage.USUARIO__ESTADO:
				return getEstado();
			case ModelPackage.USUARIO__PAIS:
				return getPais();
			case ModelPackage.USUARIO__CEP:
				return getCep();
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
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				setPrimeiroNome((String)newValue);
				return;
			case ModelPackage.USUARIO__ULTIMO_NOME:
				setUltimoNome((String)newValue);
				return;
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				setDataNascimento((String)newValue);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf((String)newValue);
				return;
			case ModelPackage.USUARIO__TELEFONE:
				setTelefone((String)newValue);
				return;
			case ModelPackage.USUARIO__ENDERECO1:
				setEndereco1((String)newValue);
				return;
			case ModelPackage.USUARIO__ENDERECO2:
				setEndereco2((String)newValue);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade((String)newValue);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado((String)newValue);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais((String)newValue);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep((String)newValue);
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
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				setPrimeiroNome(PRIMEIRO_NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ULTIMO_NOME:
				setUltimoNome(ULTIMO_NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				setDataNascimento(DATA_NASCIMENTO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case ModelPackage.USUARIO__TELEFONE:
				setTelefone(TELEFONE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ENDERECO1:
				setEndereco1(ENDERECO1_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ENDERECO2:
				setEndereco2(ENDERECO2_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade(CIDADE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais(PAIS_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep(CEP_EDEFAULT);
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
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				return PRIMEIRO_NOME_EDEFAULT == null ? primeiroNome != null : !PRIMEIRO_NOME_EDEFAULT.equals(primeiroNome);
			case ModelPackage.USUARIO__ULTIMO_NOME:
				return ULTIMO_NOME_EDEFAULT == null ? ultimoNome != null : !ULTIMO_NOME_EDEFAULT.equals(ultimoNome);
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				return DATA_NASCIMENTO_EDEFAULT == null ? dataNascimento != null : !DATA_NASCIMENTO_EDEFAULT.equals(dataNascimento);
			case ModelPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.USUARIO__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case ModelPackage.USUARIO__TELEFONE:
				return TELEFONE_EDEFAULT == null ? telefone != null : !TELEFONE_EDEFAULT.equals(telefone);
			case ModelPackage.USUARIO__ENDERECO1:
				return ENDERECO1_EDEFAULT == null ? endereco1 != null : !ENDERECO1_EDEFAULT.equals(endereco1);
			case ModelPackage.USUARIO__ENDERECO2:
				return ENDERECO2_EDEFAULT == null ? endereco2 != null : !ENDERECO2_EDEFAULT.equals(endereco2);
			case ModelPackage.USUARIO__CIDADE:
				return CIDADE_EDEFAULT == null ? cidade != null : !CIDADE_EDEFAULT.equals(cidade);
			case ModelPackage.USUARIO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case ModelPackage.USUARIO__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
			case ModelPackage.USUARIO__CEP:
				return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
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
			case ModelPackage.USUARIO___RESERVA:
				reserva();
				return null;
			case ModelPackage.USUARIO___EMPRESTA:
				empresta();
				return null;
			case ModelPackage.USUARIO___DEVOLVE:
				devolve();
				return null;
			case ModelPackage.USUARIO___RETORNA_CONSULTA:
				retornaConsulta();
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
		result.append(" (primeiroNome: ");
		result.append(primeiroNome);
		result.append(", ultimoNome: ");
		result.append(ultimoNome);
		result.append(", dataNascimento: ");
		result.append(dataNascimento);
		result.append(", email: ");
		result.append(email);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", telefone: ");
		result.append(telefone);
		result.append(", endereco1: ");
		result.append(endereco1);
		result.append(", endereco2: ");
		result.append(endereco2);
		result.append(", cidade: ");
		result.append(cidade);
		result.append(", estado: ");
		result.append(estado);
		result.append(", pais: ");
		result.append(pais);
		result.append(", cep: ");
		result.append(cep);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
