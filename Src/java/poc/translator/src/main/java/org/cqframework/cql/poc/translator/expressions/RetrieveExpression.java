package org.cqframework.cql.poc.translator.expressions;

/**
 * Created by bobd on 7/23/14.
 */
public class RetrieveExpression extends Expression{

    public enum ExModifier {
        no,
        unkown;
    }

    ExModifier existenceModifier;
    QualifiedIdentifier topic ;
    IdentifierExpression modality;
    IdentifierExpression valuesetPathIdentifier ;
    QualifiedIdentifier valueset;
    IdentifierExpression duringPathIdentifier;
    Expression duringExpression;

    public RetrieveExpression(ExModifier existenceModifier, QualifiedIdentifier topic, IdentifierExpression modality, IdentifierExpression valuesetPathIdentifier, QualifiedIdentifier valueset, IdentifierExpression duringPathIdentifier, Expression duringExpression) {
        this.existenceModifier = existenceModifier;
        this.topic = topic;
        this.modality = modality;
        this.valuesetPathIdentifier = valuesetPathIdentifier;
        this.valueset = valueset;
        this.duringPathIdentifier = duringPathIdentifier;
        this.duringExpression = duringExpression;
    }

    public ExModifier getExistenceModifier() {
        return existenceModifier;
    }

    public void setExistenceModifier(ExModifier existenceModifier) {
        this.existenceModifier = existenceModifier;
    }

    public QualifiedIdentifier getTopic() {
        return topic;
    }

    public void setTopic(QualifiedIdentifier topic) {
        this.topic = topic;
    }

    public IdentifierExpression getModality() {
        return modality;
    }

    public void setModality(IdentifierExpression modality) {
        this.modality = modality;
    }

    public IdentifierExpression getValuesetPathIdentifier() {
        return valuesetPathIdentifier;
    }

    public void setValuesetPathIdentifier(IdentifierExpression valuesetPathIdentifier) {
        this.valuesetPathIdentifier = valuesetPathIdentifier;
    }

    public QualifiedIdentifier getValueset() {
        return valueset;
    }

    public void setValueset(QualifiedIdentifier valueset) {
        this.valueset = valueset;
    }

    public IdentifierExpression getDuringPathIdentifier() {
        return duringPathIdentifier;
    }

    public void setDuringPathIdentifier(IdentifierExpression duringPathIdentifier) {
        this.duringPathIdentifier = duringPathIdentifier;
    }

    public Expression getDuringExpression() {
        return duringExpression;
    }

    public void setDuringExpression(Expression duringExpression) {
        this.duringExpression = duringExpression;
    }
}