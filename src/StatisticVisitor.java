public class StatisticVisitor implements FileDetailsVisitor{

    @Override
    public void visit(HtmlFileDetails html) {
        System.out.println("TThe file "+ html.name + " contains " + html.getLines() + " lines.");
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        int totalSec= Math.round(mp3.getSize()/ mp3.getLengthSec());
        System.out.println("The bitrate of "+ mp3.name + " is " + totalSec + " bytess per second.");
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        int avg= Math.round((float) jpg.getSize()/(float) (jpg.getHeight()* jpg.getWidth()));
        System.out.println("The picture "+ jpg.name + " has an average of " + avg + " bytes per pixel.");
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        int AvgSlides= Math.round(pptx.getSize()/ pptx.getSlides());
        System.out.println("The average slide size in Presentation "+ pptx.name + " is " + AvgSlides);
    }

    @Override
    public void visit(TxtFileDetails txt) {
        System.out.println("The file "+ txt.name + " contains " + txt.getWords() + " words.");
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        int avgDocx = Math.round(docxFileDetails.getWords()/docxFileDetails.getPages());
        System.out.println("The file "+ docxFileDetails.name +" has an average of "+ avgDocx  + " words per page." );
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        FileCountVisitor fcv= new FileCountVisitor();
        directoryDetails.accept(fcv);
        System.out.println("Directory "+ directoryDetails.name +" has "+ fcv.getTotalFiles() + " files." );
    }
}
