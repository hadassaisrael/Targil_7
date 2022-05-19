import java.util.ArrayList;
import java.util.List;

public class DirectoryDetails extends FileDetails {

   //created an array that implements a list of files
    private List<FileDetails> fileDetailsList = new ArrayList<FileDetails>();

    public DirectoryDetails(String path, String name){
        super(path,name);
    }

    @Override
    //go over all files that are in the list and Activates for each appropriate function the appropriate accept
    public void accept(FileDetailsVisitor FileDetailsVisitor) {
        for (FileDetails file: fileDetailsList) {
           file.accept(FileDetailsVisitor);
        }
        FileDetailsVisitor.visit(this);
    }

    //add a file
    public void addFile(FileDetails fileDetails){

        fileDetailsList.add(fileDetails);
    }
}