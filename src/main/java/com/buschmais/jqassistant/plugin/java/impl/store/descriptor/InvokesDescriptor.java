package com.buschmais.jqassistant.plugin.java.impl.store.descriptor;

import static com.buschmais.xo.neo4j.api.annotation.Relation.Incoming;
import static com.buschmais.xo.neo4j.api.annotation.Relation.Outgoing;

import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Defines an INVOKES relation between two methods.
 */
@Relation("INVOKES")
public interface InvokesDescriptor extends LineNumberDescriptor {

    @Outgoing
    MethodDescriptor getInvokingMethod();

    @Incoming
    MethodDescriptor getInvokedMethod();

}