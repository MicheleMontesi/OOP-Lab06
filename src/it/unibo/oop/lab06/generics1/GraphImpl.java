package it.unibo.oop.lab06.generics1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphImpl<N> implements Graph<N> {
	
	private final Map<N, LinkedList<N>> graph = new HashMap<>();
	private final Map<N, Integer> indexes = new HashMap<>();
	int index = -1;
	

	@Override
	public void addNode(N node) {
		LinkedList<N> list = new LinkedList<>();
		graph.put(node, list);
		indexes.put(node, ++index);
		
	}

	@Override
	public void addEdge(N source, N target) {
		LinkedList<N> list;
		list = graph.get(source);
		list.addFirst(target);
		graph.put(source, list);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<N> nodeSet() {
		return (Set<N>)graph.values();
	}

	@Override
	public Set<N> linkedNodes(N node) {
		Set<N> linkedNode = new HashSet<>();
		for (N vertex : graph.keySet()) {
			for (N n : graph.get(vertex)) {
				linkedNode.add(n);
			}
		}
		return linkedNode;
	}
	
	private void DFS() {
		int nodes = graph.size();
		boolean[] visited = new boolean[nodes];
		
		for (Map.Entry<N, LinkedList<N>> entry : graph.entrySet()) {
			N source = entry.getKey();
			if (!visited[indexes.get(source)]) {
				DFSUtil(source, visited);
			}
		}
	}
	
	private void DFSUtil (N source, boolean[] visited) {
		visited[indexes.get(source)] = true;
		
		LinkedList<N> list = graph.get(source);
		for (int i=0; i<list.size(); i++) {
			N destination = list.get(i);
			if (!visited[indexes.get(destination)]) {
				DFSUtil(destination, visited);
			}
		}
	}

	@Override
	public List<N> getPath(N source, N target) {
		Set<N> set = graph.keySet();
		LinkedList<N> list = null;
		Iterator<N> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			N vertex = iterator.next();
			list = graph.get(vertex);
		}
		return list;
	}
	

}
