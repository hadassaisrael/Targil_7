public class SizeCalculatorVisitor implements FileDetailsVisitor{
    int size =0;

    public int getTotalSize(){
        return size;
    }
    @Override
    public void visit(HtmlFileDetails html) {
       size += html.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        size += mp3.getSize();
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        size += jpg.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        size += pptx.getSize();
    }

    @Override
    public void visit(TxtFileDetails txt) {
        size += txt.getSize();
    }

    @Override
    public void visit(DocxFileDetails docx) {
        size += docx.getSize();
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {

    }
}
