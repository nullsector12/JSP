package member.model;

import java.util.List;

public class MemberListView {
	
	private int memberTotalCount;
	private int currentPageNumber;
	private List<Member> memberList;
	private int pageTotalCount;
	private int memberCountPerPage;
	private int startRow;
	
	public MemberListView (
			int memberTotalCount,
			int currentPageNumber,
			List<Member> memberList,
			int memberCountPerPage,
			int startRow
			) {
		this.memberTotalCount = memberTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.memberList = memberList;
		this.memberCountPerPage = memberCountPerPage;
		this.startRow = startRow;
		calTotalPageCount();
		}

	private void calTotalPageCount() {
		
		if(memberTotalCount == 0) {
			pageTotalCount=0;
		} else { 
			pageTotalCount = memberTotalCount/memberCountPerPage;
			if(memberTotalCount%memberCountPerPage>0) {
				pageTotalCount++;
			}
		}
		
	}

	/**
	 * @return the memberTotalCount
	 */
	public int getMemberTotalCount() {
		return memberTotalCount;
	}

	/**
	 * @param memberTotalCount the memberTotalCount to set
	 */
	public void setMemberTotalCount(int memberTotalCount) {
		this.memberTotalCount = memberTotalCount;
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
	 * @return the memberList
	 */
	public List<Member> getMemberList() {
		return memberList;
	}

	/**
	 * @param memberList the memberList to set
	 */
	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
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
	 * @return the memberCountPerPage
	 */
	public int getMemberCountPerPage() {
		return memberCountPerPage;
	}

	/**
	 * @param memberCountPerPage the memberCountPerPage to set
	 */
	public void setMemberCountPerPage(int memberCountPerPage) {
		this.memberCountPerPage = memberCountPerPage;
	}

	/**
	 * @return the startRow
	 */
	public int getStartRow() {
		return startRow;
	}

	/**
	 * @param startRow the startRow to set
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}


	@Override
	public String toString() {
		return "MemberListView [memberTotalCount=" + memberTotalCount + ", currentPageNumber=" + currentPageNumber
				+ ", memberList=" + memberList + ", pageTotalCount=" + pageTotalCount + ", memberCountPerPage="
				+ memberCountPerPage + ", startRow=" + startRow + "]";
	}
	
	public boolean isEmpty() {
		return memberTotalCount==0;
	}
	
}
