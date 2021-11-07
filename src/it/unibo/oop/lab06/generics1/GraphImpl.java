package it.unibo.oop.lab06.generics1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphImpl<N> implements Graph<N> {
	
	private final Map<N, Set<N>> graph = new HashMap<>();
	

	@Override
	public void addNode(N node) {
		graph.put(node, new LinkedHashSet<N>());
		
	}

	@Override
	public void addEdge(N source, N target) {
		if (!graph.containsKey(source)) {
			addNode(source);
		}
		
		if (!graph.containsKey(target)) {
			addNode(target);
		}
		
		graph.get(source).add(target);
		
	}

	@Override
	public Set<N> nodeSet() {
		
		return null;
	}

	@Override
	public Set<N> linkedNodes(N node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<N> getPath(N source, N target) {
		// TODO Auto-generated method stub
		return null;
	}

}
