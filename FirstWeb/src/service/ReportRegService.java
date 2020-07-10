package service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dao.ReportDAO;
import jdbc.ConnectionProvider;
import model.Report;

public class ReportRegService {

	private ReportRegService() {
	}

	private static ReportRegService service = new ReportRegService();

	public static ReportRegService getInstance() {
		return service;
	}

	ReportDAO dao;

	public int regReport(HttpServletRequest request) {

		int resultCnt = 0;
		
		String sname = "";
		String sno = "";
		String filePath = "";
		
		Connection conn = null;

		try {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	
			if (isMultipart) {
	
				DiskFileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
	
				List<FileItem> items = upload.parseRequest(request);
	
				Iterator<FileItem> ite = items.iterator();
	
				while (ite.hasNext()) {
	
					FileItem item = ite.next();
	
					// isFormField() : text value�� ������ input Ȯ��
					if (item.isFormField()) { // type=file �̿��� input
						// �Ķ���� �̸�
						String paramName = item.getFieldName();
						// �Ķ������ ��
						String paramValue = item.getString("utf-8");
						//System.out.println(paramName + " = " + paramValue);
						
						if(paramName.equals("sname")){
							sname = paramValue;
						} else if(paramName.equals("sno")) {
							sno = paramValue;
						}
						
					} else { // type=file
						// �Ķ���� �̸�
						String paramName = item.getFieldName();
						// ���� �̸�
						String fileName = item.getName();
						// ������ ������
						long file_size = item.getSize();
						// ������ Ÿ��
						String contentType = item.getContentType();
						// �ӽ� �޸𸮿� ���� ����
						boolean isInMemory = item.isInMemory();
						System.out.println("�ʵ� �̸� : " + paramName);
						System.out.println("���� �̸� : " + fileName);
						System.out.println("���� ������ : " + file_size);
						System.out.println("���� Ÿ�� : " + contentType);
	
						// ���� ������ ���
						// String uri = "/file";
	
						String uri = request.getSession().getServletContext().getInitParameter("uploadPath");
	
						// �ý����� ����(����) ���
						String realPath = request.getSession().getServletContext().getRealPath(uri);
						// System.out.println(realPath);
	
						String newFileName = System.nanoTime() + "_" + fileName;
	
						// ������ ����ҿ� ���� ����
						File saveFile = new File(realPath, newFileName);
						item.write(saveFile);
						System.out.println("������ : "+realPath);
						System.out.println("���� �Ϸ�");
						
						filePath = uri+"/"+newFileName;
	
					}
	
				}
				
				
				// ������ ���̽� ���� 
				Report report = new Report();
				report.setSname(sname);
				report.setSno(sno);
				report.setReport(filePath);
				
				
				
				conn = ConnectionProvider.getConnection();
				
				dao = ReportDAO.getInstance();
				resultCnt = dao.insertReport(conn, report);
				
				request.setAttribute("report", report);
	
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		

		return resultCnt;
	}

}