package max.auth;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SolveOut(
    String id,
    String name,
    String role
) {
    
}
