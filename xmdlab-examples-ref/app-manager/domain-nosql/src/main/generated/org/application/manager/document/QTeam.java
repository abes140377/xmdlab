package org.application.manager.document;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTeam is a Querydsl query type for Team
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTeam extends EntityPathBase<Team> {

    private static final long serialVersionUID = -400272313L;

    public static final QTeam team = new QTeam("team");

    public final org.xmdlab.framework.jee.document.QAbstractDocument _super = new org.xmdlab.framework.jee.document.QAbstractDocument(this);

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QTeam(String variable) {
        super(Team.class, forVariable(variable));
    }

    public QTeam(Path<? extends Team> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeam(PathMetadata<?> metadata) {
        super(Team.class, metadata);
    }

}

