public interface FileDetailsVisitor {


    public void visit(HtmlFileDetails html);
    public void visit(Mp3FileDetails mp3);
    public void visit(JpgFileDetails jpg);
    public void visit(PptxFileDetails pptx);
    public void visit(TxtFileDetails txt);
    public void visit(DocxFileDetails docxFileDetails);
    public void visit(DirectoryDetails directoryDetails);
}
