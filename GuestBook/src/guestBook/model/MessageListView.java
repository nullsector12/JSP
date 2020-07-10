package guestBook.model;

import java.util.List;

public class MessageListView {
	
	// ��ü �Խù��� ��
	private int messageTotalCount;
	
	// ���� ������ ��ȣ
	private int currentPageNumber;
	
	// �Էµ� �Խù� ����Ʈ
	private List<Message> messageList;
	
	// �Խ��� ������ ��ü ��
	private int pageTotalCount;
	
	// ������ �� ǥ�� �Խù��� ��
	private int messageCountPerPage;
	
	// �Խù� ����Ʈ�� ���� ��
	private int StartRow;
	
	// �Խù� ����Ʈ�� ������ ��
	private int endRow;
	
	public MessageListView(List<Message> messageList, int messageTotalCount, int currentPageNumber, int messageCountPerPage,
			int startRow, int endRow) {
		this.messageList = messageList;
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageCountPerPage = messageCountPerPage;
		this.StartRow = startRow;
		this.endRow = endRow;
		calTotalPageCount();
	}
	
	private void calTotalPageCount() {
		if(messageTotalCount == 0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = messageTotalCount/messageCountPerPage;
			if (messageTotalCount%messageCountPerPage > 0) {
				pageTotalCount++;
			}
		}
	}

	/**
	 * @return the messageTotalCount
	 */
	public int getMessageTotalCount() {
		return messageTotalCount;
	}

	/**
	 * @param messageTotalCount the messageTotalCount to set
	 */
	public void setMessageTotalCount(int messageTotalCount) {
		this.messageTotalCount = messageTotalCount;
	}

	/**
	 * @return the currentPageNumber
	 */
	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	/**
	 * @param currentPageNumber the currentPageNumber to set
	 */
	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	/**
	 * @return the messageList
	 */
	public List<Message> getMessageList() {
		return messageList;
	}

	/**
	 * @param messageList the messageList to set
	 */
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	/**
	 * @return the pageTotalCount
	 */
	public int getPageTotalCount() {
		return pageTotalCount;
	}

	/**
	 * @param pageTotalCount the pageTotalCount to set
	 */
	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}

	/**
	 * @return the messageCountPerPage
	 */
	public int getMessageCountPerPage() {
		return messageCountPerPage;
	}

	/**
	 * @param messageCountPerPage the messageCountPerPage to set
	 */
	public void setMessageCountPerPage(int messageCountPerPage) {
		this.messageCountPerPage = messageCountPerPage;
	}

	/**
	 * @return the startRow
	 */
	public int getStartRow() {
		return StartRow;
	}

	/**
	 * @param startRow the startRow to set
	 */
	public void setStartRow(int startRow) {
		StartRow = startRow;
	}

	/**
	 * @return the endRow
	 */
	public int getEndRow() {
		return endRow;
	}

	/**
	 * @param endRow the endRow to set
	 */
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	
	public boolean isEmpty() {
		return messageTotalCount == 0;
	}

}
