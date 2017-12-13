/*
 * (C) Copyright 2003-2017, by Barak Naveh and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
package org.jgrapht.graph;

import java.util.*;
import org.jgrapht.*;

/**
 * An undirected graph that is a subgraph of another graph.
 *
 * @param <V> the graph vertex type
 * @param <E> the graph edge type
 * @see Subgraph
 * @deprecated In favor of {@link AsSubgraph}.
 */
@Deprecated
public class UndirectedSubgraph<V, E> extends Subgraph<V, E, UndirectedGraph<V, E>>
    implements UndirectedGraph<V, E> {
  private static final long serialVersionUID = 3256728359772631350L;

  /**
   * Creates a new undirected subgraph.
   *
   * @param base the base (backing) graph on which the subgraph will be based.
   * @param vertexSubset vertices to include in the subgraph. If <code>null</code> then all vertices
   *     are included.
   * @param edgeSubset edges to include in the subgraph. If <code>null</code> then all the edges
   *     whose vertices found in the graph are included.
   */
  public UndirectedSubgraph(
      UndirectedGraph<V, E> base, Set<? extends V> vertexSubset, Set<? extends E> edgeSubset) {
    super(base, vertexSubset, edgeSubset);
  }

  /**
   * Creates a new undirected induced subgraph.
   *
   * @param base the base (backing) graph on which the subgraph will be based.
   * @param vertexSubset vertices to include in the subgraph. If <code>null</code> then all vertices
   *     are included.
   */
  public UndirectedSubgraph(UndirectedGraph<V, E> base, Set<? extends V> vertexSubset) {
    this(base, vertexSubset, null);
  }

  /**
   * Creates a new undirected induced subgraph with all vertices included.
   *
   * @param base the base (backing) graph on which the subgraph will be based.
   */
  public UndirectedSubgraph(UndirectedGraph<V, E> base) {
    this(base, null, null);
  }
}

// End UndirectedSubgraph.java
