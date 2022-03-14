package mirror.android.content.pm;

import android.content.pm.VersionedPackage;

import java.util.List;

import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefConstructor;


/**
 * @author LittleAngry
 */
public class SharedLibraryInfo {
    public static Class<?> TYPE = RefClass.load(SharedLibraryInfo.class, "android.content.pm.SharedLibraryInfo");
    @MethodParams({String.class, String.class, List.class,
            String.class, long.class, int.class,
            VersionedPackage.class, List.class,
            List.class, boolean.class})
    public static RefConstructor constructor;
}
