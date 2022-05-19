public class ShortPrintVisitor implements FileDetailsVisitor {


    @Override
    public void visit(HtmlFileDetails html) {
        System.out.println(html.name);
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        System.out.println(mp3.name);
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        System.out.println(jpg.name);
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        System.out.println(pptx.name);
    }

    @Override
    public void visit(TxtFileDetails txt) {
        System.out.println(txt.name);
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        System.out.println(docxFileDetails.name);
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        System.out.println(directoryDetails.name);
    }
}
