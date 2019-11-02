<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC “-//W3C//DTD HTML 4.01 Transitional//EN"
    “http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html;
                  charset=UTF-8"/>
            <title>Formulário de Cadastro</title>
        </head>
        <body>
            <h1>
                <h:outputText value="Informe seus dados"/>
            </h1>

        <h:form>
            <h:panelGrid border="0" columns="2">
                <h:outputText value="Nome:" />
                <h:inputText value="#{pessoa.nome}" size="30"/>

                <h:outputText value="Sexo:" />
                <h:selectOneRadio id="sexo" value="#{pessoa.sexo}">

                    <f:selectItem itemLabel="Masculino"
                                  itemValue="Masculino" />

                    <f:selectItem itemLabel="Feminino"
                                  itemValue="Feminino" />
                </h:selectOneRadio>

                <h:outputText value="Interesse:" />
                <h:selectManyCheckbox id="interesse"
                                      value="#{pessoa.interesse}" layout="pageDirection">

                    <f:selectItem itemLabel="Notícias"
                                  itemValue="Notícias" />
                    <f:selectItem itemLabel="Esportes"
                                  itemValue="Esportes" />
                    <f:selectItem itemLabel="Tecnologia"
                                  itemValue="Tecnologia"/>
                </h:selectManyCheckbox>

                <h:outputText value="Observações:" />
                <h:inputTextarea value="#{pessoa.observacoes}"
                                 cols="30" rows="5" />

            </h:panelGrid>

            <h:commandButton value="cadastrar"
                             action="#{pessoa.cadastrar}" />
            <h:inputHidden value="pessoa.dataatual" />
        </h:form>
        </body>
    </html>
</f:view>