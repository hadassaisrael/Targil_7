public class FileCountVisitor implements FileDetailsVisitor{

    int count =0;
    public int getTotalFiles(){
        return count;
    }

    @Override
    public void visit(HtmlFileDetails html) {
        count ++;
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        count ++;
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        count ++;
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        count ++;
    }

    @Override
    public void visit(TxtFileDetails txt) {
        count ++;
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        count ++;
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {}
}
