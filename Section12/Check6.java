import java.io.FilePermission;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

public class Check6 {
    public static void main(String[] args) throws IOException {

        Permissions permissions = new Permissions();
        permissions.add(new FilePermission("/", "read"));
        Policy.setPolicy(new SamplePolicy6(permissions));
        System.setSecurityManager(new SecurityManager());
        Files.list(Paths.get("/")).forEach((p) -> {
            System.out.println(p.getFileName());
        });
    }
}

// セキュリティポリシーの設定
class SamplePolicy6 extends Policy {
    private final PermissionCollection permissions;

    public SamplePolicy6(PermissionCollection permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean implies(ProtectionDomain domain, Permission permission) {
        return permissions.implies(permission);
    }

}