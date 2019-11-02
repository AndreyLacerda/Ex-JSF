<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html;
                  charset=UTF-8"/>
            <title>Validação Explícita</title>
        </head>
        <body>
            <h1><h:outputText value="Cadastro de Funcionários"/></h1>
            <h:form>
                <h:panelGrid columns="3" border="0">
                    <h:outputText value="Nome: "/>
                    <h:inputText id="nome" value="#{func.nome}"
                                 required="true" >
                        <f:validateLength minimum="5" maximum="16" />
                    </h:inputText>
                    <h:message for="nome" style="color:#FF0000;" />

                    <h:outputText value="Salário "/>
                    <h:inputText id="salario" value="#{func.salario}"
                                 required="true">
                        <f:validateDoubleRange minimum="500.00" />
                    </h:inputText>
                    <h:message for="salario" style="color:#FF0000;" />

                    <h:outputText value="Idade: "/>
                    <h:inputText id="idade" value="#{func.idade}"
                                 required="true">
                        <f:validateLongRange minimum="18" />
                    </h:inputText>
                    <h:message for="idade" style="color:#FF0000;" />

                </h:panelGrid>
                <h:inputHidden binding="#{func.tipo}" value="3" />

                <h:commandButton value="cadastrar"
                                 action="#{func.cadastrar}"/>
            </h:form>
        </body>
    </html>
</f:view>