package com.paulasantana.opencommunity.usecase.project;

public class ErrorResponse {
  private int status;
  private String type;
  private String title;
  private String detail;

  /**
   * Contrutor do Objeto.
   * @param status Status code.
   * @param type qual exception.
   * @param title mensagem da exception.
   * @param detail detalhes como rota que deu erro.
   */
  public ErrorResponse(int status, String type, String title, String detail) {
    this.status = status;
    this.type = type;
    this.title = title;
    this.detail = detail;
  }
}
