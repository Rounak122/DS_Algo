package DS;

import java.io.*;
import java.util.*;

public class Graph {
	
	LinkedList<Integer> [] adj;
	
	
	public Graph(int v){
		
		adj = new LinkedList[v];
		for (int i= 0 ; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
		
	}
	
	public void addEdge(int source, int destination) {
		
		adj[source].add(destination);
		adj[destination].add(source);
		
	}
	
	
	public int bfs(int source, int destination) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		
		while(!q.isEmpty()) {
			
			temp = q.remove();
			
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int v = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		Graph graph = new Graph(v);
		
		for(int i = 0 ; i<e; i++) {
			
			int source = Integer.parseInt(br.readLine());
			int destination = Integer.parseInt(br.readLine());
			
			graph.addEdge(source, destination);
			
		}
		
		
	}

}
