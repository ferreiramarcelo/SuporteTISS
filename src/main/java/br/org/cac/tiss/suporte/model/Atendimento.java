package br.org.cac.tiss.suporte.model;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Atendimento generated by hbm2java
 */
@Entity
@Table(name = "ATENDIMENTO")
public class Atendimento implements java.io.Serializable {

	private AtendimentoId id;
	private Atendimento atendimento;
	private Prestador prestador;
	private SubProcesso subProcesso;
	private boolean FCobrancaParcial;
	private Date dtAtendimento;
	private Integer idGuia;
	private Short idProrrogacaoGuia;
	private Long numeroCarteira;
	private Short dv;
	private int idDocumento;
	private String cpfCgcAssociacao;
	private String matriculaAssociacao;
	private String cpfCgcSolicitante;
	private String registroConselhoSolicitante;
	private Date timestamp;
	private String horaAtendimento;
	private Integer idProfissionalEquipe;
	private Integer idEndereco;
	private Integer idPrestadorSolicitantePf;
	private Integer idPrestadorServicoPf;
	private Date dthrInicioFaturamento;
	private Date dthrFimFaturamento;
	private String numGuiaPrestador;
	private Character DIndicacaoAcidente;
	private Boolean FAtendimentoRn;
	private Integer idPrestadorCboExecut;
	private Integer idPrestadorCboSolicit;
	private Integer idPrestadorLocal;
	private Integer idTipoInternacaoAns;
	private Character DRegimeInternacao;
	private Set<Procedimento> procedimentos = new HashSet<Procedimento>(0);
	private Set<Atendimento> atendimentos = new HashSet<Atendimento>(0);

	public Atendimento() {
	}

	public Atendimento(AtendimentoId id, SubProcesso subProcesso, boolean FCobrancaParcial, int idDocumento,
			Date timestamp) {
		this.id = id;
		this.subProcesso = subProcesso;
		this.FCobrancaParcial = FCobrancaParcial;
		this.idDocumento = idDocumento;
		this.timestamp = timestamp;
	}

	public Atendimento(AtendimentoId id, Atendimento atendimento, Prestador prestador, SubProcesso subProcesso,
			boolean FCobrancaParcial, Date dtAtendimento, Integer idGuia, Short idProrrogacaoGuia, Long numeroCarteira,
			Short dv, int idDocumento, String cpfCgcAssociacao, String matriculaAssociacao, String cpfCgcSolicitante,
			String registroConselhoSolicitante, Date timestamp, String horaAtendimento, Integer idProfissionalEquipe,
			Integer idEndereco, Integer idPrestadorSolicitantePf, Integer idPrestadorServicoPf,
			Date dthrInicioFaturamento, Date dthrFimFaturamento, String numGuiaPrestador, Character DIndicacaoAcidente,
			Boolean FAtendimentoRn, Integer idPrestadorCboExecut, Integer idPrestadorCboSolicit,
			Integer idPrestadorLocal, Integer idTipoInternacaoAns, Character DRegimeInternacao,
			Set<Procedimento> procedimentos, Set<Atendimento> atendimentos) {
		this.id = id;
		this.atendimento = atendimento;
		this.prestador = prestador;
		this.subProcesso = subProcesso;
		this.FCobrancaParcial = FCobrancaParcial;
		this.dtAtendimento = dtAtendimento;
		this.idGuia = idGuia;
		this.idProrrogacaoGuia = idProrrogacaoGuia;
		this.numeroCarteira = numeroCarteira;
		this.dv = dv;
		this.idDocumento = idDocumento;
		this.cpfCgcAssociacao = cpfCgcAssociacao;
		this.matriculaAssociacao = matriculaAssociacao;
		this.cpfCgcSolicitante = cpfCgcSolicitante;
		this.registroConselhoSolicitante = registroConselhoSolicitante;
		this.timestamp = timestamp;
		this.horaAtendimento = horaAtendimento;
		this.idProfissionalEquipe = idProfissionalEquipe;
		this.idEndereco = idEndereco;
		this.idPrestadorSolicitantePf = idPrestadorSolicitantePf;
		this.idPrestadorServicoPf = idPrestadorServicoPf;
		this.dthrInicioFaturamento = dthrInicioFaturamento;
		this.dthrFimFaturamento = dthrFimFaturamento;
		this.numGuiaPrestador = numGuiaPrestador;
		this.DIndicacaoAcidente = DIndicacaoAcidente;
		this.FAtendimentoRn = FAtendimentoRn;
		this.idPrestadorCboExecut = idPrestadorCboExecut;
		this.idPrestadorCboSolicit = idPrestadorCboSolicit;
		this.idPrestadorLocal = idPrestadorLocal;
		this.idTipoInternacaoAns = idTipoInternacaoAns;
		this.DRegimeInternacao = DRegimeInternacao;
		this.procedimentos = procedimentos;
		this.atendimentos = atendimentos;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idProcesso", column = @Column(name = "id_processo", nullable = false)),
			@AttributeOverride(name = "anoApresentacao", column = @Column(name = "ano_apresentacao", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "idRepresentacao", column = @Column(name = "id_representacao", nullable = false)),
			@AttributeOverride(name = "DSubProcesso", column = @Column(name = "d_sub_processo", nullable = false, length = 1)),
			@AttributeOverride(name = "DNatureza", column = @Column(name = "d_natureza", nullable = false, length = 1)),
			@AttributeOverride(name = "idSequencialNatureza", column = @Column(name = "id_sequencial_natureza", nullable = false)),
			@AttributeOverride(name = "idAtendimento", column = @Column(name = "id_atendimento", nullable = false)) })
	public AtendimentoId getId() {
		return this.id;
	}

	public void setId(AtendimentoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_processo_associado", referencedColumnName = "id_processo"),
			@JoinColumn(name = "ano_apresentacao_associado", referencedColumnName = "ano_apresentacao"),
			@JoinColumn(name = "id_representacao_associado", referencedColumnName = "id_representacao"),
			@JoinColumn(name = "d_sub_processo_associado", referencedColumnName = "d_sub_processo"),
			@JoinColumn(name = "d_natureza_associado", referencedColumnName = "d_natureza"),
			@JoinColumn(name = "id_seq_natureza_associado", referencedColumnName = "id_sequencial_natureza"),
			@JoinColumn(name = "id_atendimento_associado", referencedColumnName = "id_atendimento") })
	public Atendimento getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_prestador_reembolso")
	public Prestador getPrestador() {
		return this.prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "id_processo", referencedColumnName = "id_processo", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ano_apresentacao", referencedColumnName = "ano_apresentacao", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "id_representacao", referencedColumnName = "id_representacao", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "d_sub_processo", referencedColumnName = "d_sub_processo", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "d_natureza", referencedColumnName = "d_natureza", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "id_sequencial_natureza", referencedColumnName = "id_sequencial_natureza", nullable = false, insertable = false, updatable = false) })
	public SubProcesso getSubProcesso() {
		return this.subProcesso;
	}

	public void setSubProcesso(SubProcesso subProcesso) {
		this.subProcesso = subProcesso;
	}

	@Column(name = "f_cobranca_parcial", nullable = false)
	public boolean isFCobrancaParcial() {
		return this.FCobrancaParcial;
	}

	public void setFCobrancaParcial(boolean FCobrancaParcial) {
		this.FCobrancaParcial = FCobrancaParcial;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_atendimento", length = 23)
	public Date getDtAtendimento() {
		return this.dtAtendimento;
	}

	public void setDtAtendimento(Date dtAtendimento) {
		this.dtAtendimento = dtAtendimento;
	}

	@Column(name = "id_guia")
	public Integer getIdGuia() {
		return this.idGuia;
	}

	public void setIdGuia(Integer idGuia) {
		this.idGuia = idGuia;
	}

	@Column(name = "id_prorrogacao_guia")
	public Short getIdProrrogacaoGuia() {
		return this.idProrrogacaoGuia;
	}

	public void setIdProrrogacaoGuia(Short idProrrogacaoGuia) {
		this.idProrrogacaoGuia = idProrrogacaoGuia;
	}

	@Column(name = "numero_carteira", precision = 17, scale = 0)
	public Long getNumeroCarteira() {
		return this.numeroCarteira;
	}

	public void setNumeroCarteira(Long numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	@Column(name = "dv")
	public Short getDv() {
		return this.dv;
	}

	public void setDv(Short dv) {
		this.dv = dv;
	}

	@Column(name = "id_documento", nullable = false)
	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	@Column(name = "cpf_cgc_associacao", length = 14)
	public String getCpfCgcAssociacao() {
		return this.cpfCgcAssociacao;
	}

	public void setCpfCgcAssociacao(String cpfCgcAssociacao) {
		this.cpfCgcAssociacao = cpfCgcAssociacao;
	}

	@Column(name = "matricula_associacao", length = 12)
	public String getMatriculaAssociacao() {
		return this.matriculaAssociacao;
	}

	public void setMatriculaAssociacao(String matriculaAssociacao) {
		this.matriculaAssociacao = matriculaAssociacao;
	}

	@Column(name = "cpf_cgc_solicitante", length = 14)
	public String getCpfCgcSolicitante() {
		return this.cpfCgcSolicitante;
	}

	public void setCpfCgcSolicitante(String cpfCgcSolicitante) {
		this.cpfCgcSolicitante = cpfCgcSolicitante;
	}

	@Column(name = "registro_conselho_solicitante", length = 8)
	public String getRegistroConselhoSolicitante() {
		return this.registroConselhoSolicitante;
	}

	public void setRegistroConselhoSolicitante(String registroConselhoSolicitante) {
		this.registroConselhoSolicitante = registroConselhoSolicitante;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "hora_atendimento", length = 5)
	public String getHoraAtendimento() {
		return this.horaAtendimento;
	}

	public void setHoraAtendimento(String horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	@Column(name = "id_profissional_equipe")
	public Integer getIdProfissionalEquipe() {
		return this.idProfissionalEquipe;
	}

	public void setIdProfissionalEquipe(Integer idProfissionalEquipe) {
		this.idProfissionalEquipe = idProfissionalEquipe;
	}

	@Column(name = "id_endereco")
	public Integer getIdEndereco() {
		return this.idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	@Column(name = "id_prestador_solicitante_pf")
	public Integer getIdPrestadorSolicitantePf() {
		return this.idPrestadorSolicitantePf;
	}

	public void setIdPrestadorSolicitantePf(Integer idPrestadorSolicitantePf) {
		this.idPrestadorSolicitantePf = idPrestadorSolicitantePf;
	}

	@Column(name = "id_prestador_servico_pf")
	public Integer getIdPrestadorServicoPf() {
		return this.idPrestadorServicoPf;
	}

	public void setIdPrestadorServicoPf(Integer idPrestadorServicoPf) {
		this.idPrestadorServicoPf = idPrestadorServicoPf;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dthr_inicio_faturamento", length = 23)
	public Date getDthrInicioFaturamento() {
		return this.dthrInicioFaturamento;
	}

	public void setDthrInicioFaturamento(Date dthrInicioFaturamento) {
		this.dthrInicioFaturamento = dthrInicioFaturamento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dthr_fim_faturamento", length = 23)
	public Date getDthrFimFaturamento() {
		return this.dthrFimFaturamento;
	}

	public void setDthrFimFaturamento(Date dthrFimFaturamento) {
		this.dthrFimFaturamento = dthrFimFaturamento;
	}

	@Column(name = "num_guia_prestador", length = 20)
	public String getNumGuiaPrestador() {
		return this.numGuiaPrestador;
	}

	public void setNumGuiaPrestador(String numGuiaPrestador) {
		this.numGuiaPrestador = numGuiaPrestador;
	}

	@Column(name = "d_indicacao_acidente", length = 1)
	public Character getDIndicacaoAcidente() {
		return this.DIndicacaoAcidente;
	}

	public void setDIndicacaoAcidente(Character DIndicacaoAcidente) {
		this.DIndicacaoAcidente = DIndicacaoAcidente;
	}

	@Column(name = "f_atendimento_rn")
	public Boolean getFAtendimentoRn() {
		return this.FAtendimentoRn;
	}

	public void setFAtendimentoRn(Boolean FAtendimentoRn) {
		this.FAtendimentoRn = FAtendimentoRn;
	}

	@Column(name = "id_prestador_cbo_execut")
	public Integer getIdPrestadorCboExecut() {
		return this.idPrestadorCboExecut;
	}

	public void setIdPrestadorCboExecut(Integer idPrestadorCboExecut) {
		this.idPrestadorCboExecut = idPrestadorCboExecut;
	}

	@Column(name = "id_prestador_cbo_solicit")
	public Integer getIdPrestadorCboSolicit() {
		return this.idPrestadorCboSolicit;
	}

	public void setIdPrestadorCboSolicit(Integer idPrestadorCboSolicit) {
		this.idPrestadorCboSolicit = idPrestadorCboSolicit;
	}

	@Column(name = "id_prestador_local")
	public Integer getIdPrestadorLocal() {
		return this.idPrestadorLocal;
	}

	public void setIdPrestadorLocal(Integer idPrestadorLocal) {
		this.idPrestadorLocal = idPrestadorLocal;
	}

	@Column(name = "id_tipo_internacao_ANS")
	public Integer getIdTipoInternacaoAns() {
		return this.idTipoInternacaoAns;
	}

	public void setIdTipoInternacaoAns(Integer idTipoInternacaoAns) {
		this.idTipoInternacaoAns = idTipoInternacaoAns;
	}

	@Column(name = "d_regime_internacao", length = 1)
	public Character getDRegimeInternacao() {
		return this.DRegimeInternacao;
	}

	public void setDRegimeInternacao(Character DRegimeInternacao) {
		this.DRegimeInternacao = DRegimeInternacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atendimento")
	public Set<Procedimento> getProcedimentos() {
		return this.procedimentos;
	}

	public void setProcedimentos(Set<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atendimento")
	public Set<Atendimento> getAtendimentos() {
		return this.atendimentos;
	}

	public void setAtendimentos(Set<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}

}
