package com.bmg.vault.listeners;

public interface Listenerable {
	void addListener(Listener listener);

	void removeListener(Listener listener);
}
